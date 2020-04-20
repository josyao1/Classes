package RecursionPractice;

// note: optimized for tracing variety
public class Recursion1
{
	
	public static void main(String[] args) {
		System.out.println(mystery(4));
	}
	
	public static int mystery(int n) {
		if(n<=0)
			return 0;
		return mystery(mystery(n-2));
	}

    public int fibonacci(int n)
    {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
        ///       call 1            call 2
    }
    
/*
 * 
 * 
 * fibonacci(0)  returns 0
 * fibonacci(1)  returns 1
 * fibonacci (2)  returns 1
 * fibonacci (3)  returns 2
 * fibonacci (4)  returns 3
 */

    public int triangle(int rows)
    {
        if (rows == 0)
            return 0;

        return rows + triangle(rows - 1);
    }
    
 /*
triangle(0) returns 0
triangle(1) returns 1
triangle(2) returns 3 
triangle(3) returns 6
  */

    public int sumDigits(int n)
    {
        if (n <= 9)
            return n;

        return sumDigits(n / 10) + n % 10;
    }
    
/*
 * 
 * sumDigits(1) return 1
 * sumDigits(12) return 3 
 * sumDigits(123) return 6 
 * sumDigits(1234) return 10
 */
    
    public int count7(int n)
    {
        if (n == 0)
            return 0;

        int sevens = count7(n / 10);

        if (n % 10 == 7)
            sevens++;

        return sevens;
    }
    
/*
 * count7(0) returns 0
 * count7(4) sevens:0  returns 0
 * count7(45) sevens:0 returns 0
 * count7(457) sevens:0 returns 1
 * count7(4578) sevens:1 returns 1
 * count7(45787) sevens: 1 returns 2
 */

    public int count8(int n)
    {
        if (n == 0)
            return 0;

        int lastDigit = n % 10;
        int secondToLastDigit = n / 10 % 10;

        int eights = 0;

        if (lastDigit == 8)
        {
            eights++;
            if (secondToLastDigit == 8)
                eights++;
        }

        return eights + count8(n / 10);
    }
    
/*
 * 
 * count8(0) return 0
 * count8(6) lastDigit:6  secondToLastDigit:0  eights:0  return 0
 * count8(67) lastDigit:7  secondToLastDigit:6  eights:0 return 0
 * count8(678) lastDigit:8  secondToLastDigit:7  eights:1 return 1
 * count8(6789) lastDigit:9  secondToLastDigit:8  eights:0  return 1
 * count8(67898) lastDigit:8  secondToLastDigit:9  eights:1  return 2
 */
    
    public int countX(String str)
    {
        if (str.length() == 0)
            return 0;

        int xs = countX(str.substring(1));

        if (str.substring(0, 1).equals("x"))
            xs++;

        return xs;
    }

/*
 * 
 * countX("") return 0
 * countX("y") xs:0 return 0
 * countX("xy") xs:1 return 1
 * countX("xxy") xs:2 return 2
 * countX("yxxy") xs:2 return 2
 */
    
    
    public String changeXY(String str)
    {
        if (str.length() == 0)
            return "";

        if (str.charAt(0) == 'x')
            return "y" + changeXY(str.substring(1));
        else
            return str.substring(0, 1) + changeXY(str.substring(1));
    }
    
/*
 * changeXY("") return ""
 * changeXY("x") return "y"
 * changeXY("xy") return "yy"
 * changeXY("yxy") return "yyy"
 * changeXY("xyxy") return "yyyy"
 */
    
    
    
    
    
    
    
}
