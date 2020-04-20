package Magpie;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class ModifiedMagpieTester extends TestCase
{
    public void testFindKeyword()
    {
        String str = "";
        final String keyword = "cat";

        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> actualResult = ModifiedMagpie.findKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));


        str = "cat";

        expectedResult.add(0);
        actualResult = ModifiedMagpie.findKeyword(str, keyword);
 

        assertTrue(expectedResult.equals(actualResult));


        str = "cat caterpillar bobcat";
///            0123456789012345678901
        expectedResult.add(4);
        expectedResult.add(19);

        actualResult = ModifiedMagpie.findKeyword(str, keyword);


        assertTrue(expectedResult.equals(actualResult));
    }

    public void testFindIsolatedKeywordBeginning()
    {
        String str = "cat dog hamster";
        final String keyword = "cat";

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(0);

        List<Integer> actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

      

        assertTrue(expectedResult.equals(actualResult));


        str = "cat, dog, hamster";

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));
      


        str = "cats, dogs, hamsters";

        expectedResult.remove(0);

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));
    }

    public void testFindIsolatedKeywordMiddle()
    {
        String str = "dog cat hamster";
        final String keyword = "cat";

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(4);

        List<Integer> actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));


        str = "dog-cat-hamster";

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));


        str = "dogs, cats, hamsters";

        expectedResult.remove(0);

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));


        str = "dogs bobcats hamsters";

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));
    }

    public void testFindIsolatedKeywordEnd()
    {
        String str = "dog hamster cat";
        final String keyword = "cat";

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(12);

        List<Integer> actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        
        System.out.println("Actual Result:");
        System.out.println(actualResult);
        System.out.println("Expected Result:");
        System.out.println(expectedResult);
        
        assertTrue(expectedResult.equals(actualResult));
      


        str = "dog-hamster-cat";

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));


        str = "dogs hamsters cats";

        expectedResult.remove(0);

        actualResult = ModifiedMagpie.findIsolatedKeyword(str, keyword);

        assertTrue(expectedResult.equals(actualResult));
    }
}
