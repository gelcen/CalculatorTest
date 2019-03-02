/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import static java.lang.System.exit;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Gelcen
 */
public class Calculator {
    
    private String expression;
    private Stack<Character> charStack;
    
    public Calculator()
    {
        charStack = new Stack<Character>();
    }
    
    public void setExpression(String expression)
    {
        this.expression = expression;
        if (this.expression.length() != 0)
        {
            stringToStack(this.expression);
        }
        Iterator<Character> itr = charStack.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
    private void stringToStack(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        for (int i = 0; i < str1.length(); i++)
        {
            charStack.push(str1.charAt(i));
        }
    }
    
    public double Calculate()
    {
        double result = factor();
        char c;
        
        while (true)
        {
            c = charStack.pop();
            
            switch (c)
            {
                case '+':
                    result += factor();
                    break;
                case '-':
                    result -= factor();
                    break;
                default:
                    charStack.push(c);
                    return result;
            }
        }
    }
    
    private double factor()
    {
        double result = brackets();
        double temp;
        char c;
        
        while(true)
        {
            c = charStack.pop();
            
            switch(c)
            {
                case '*':
                    result *= brackets();
                    break;
                case '/':
                    temp = brackets();
                    
                    if (temp == 0.0)
                    {
                        //TODO throw exception
                    }
                    else 
                    {
                        result /= temp;                        
                    }
                    break;
                default:
                    charStack.push(c);
                    return result;                                        
            }
        }
    }
    
    private double brackets()
    {
        double result;
        int sign = 1;
        char c;
        
        c = charStack.pop();
        
        if (c=='-')
        {
            sign = -1;
            c = charStack.pop();
        }
        
        if (c=='(')
        {
            result = sign * Calculate();
            
            c = charStack.pop();
            
            //check c!@!@#!
            if (c != ')')
            {
                System.out.println("Wrong brackets");
                exit(-1);
            }
            
            return result;
        }
        else 
        {
            charStack.push(c);
            
            return sign * number();
        }        
    }
    
    private double number()
    {
        double result = 0.0;
        double k = 10.0;
        int sign = 1;
        char c;
        
        c = charStack.pop();
        
        if (c == '-')
        {
            sign = -1;
        }
        else 
        {
            charStack.push(c);
        }
        
        while (true)
        {   
            c = charStack.pop();
            
            if (Character.isDigit(c)) {
                result = result * 10.0 + (c - '0');
            } else {
                charStack.push(c);
                break;
            }                      
        }
                
        c = charStack.pop();
        
        
        if (c == '.')
        {
            while (true)
            {
                c = charStack.pop();
                
                if (Character.isDigit(c))
                {
                    result += (c-'0')/k;
                    k*=10.0;
                }
                else 
                {
                    charStack.push(c);
                    break;
                }
            }
        }
        else 
        {
            charStack.push(c);            
        }
        
        return sign * result;
    }
    
}
