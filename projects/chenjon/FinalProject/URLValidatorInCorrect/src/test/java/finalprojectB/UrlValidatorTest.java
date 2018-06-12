
package finalprojectB;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!


public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }
/****************
** Manual Testing
*****************/
   public void test_1_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "http://google.com";
      assertEquals( true, urlVal.isValid(test));
   }
   public void test_2_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "file://depot.engr.oregonstate.edu/users/";
      assertEquals( true, urlVal.isValid(test));
   }
   public void test_3_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "google";
      assertEquals( false, urlVal.isValid(test));
   }
   public void test_4_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "https://github.com";
      assertEquals( true, urlVal.isValid(test));
   }
   public void test_5_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "https://amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=watch";
      assertEquals( true, urlVal.isValid(test));
   }
   public void test_6_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "whitehouse.gov:80";
      assertEquals( true, urlVal.isValid(test));
   }
   public void test_7_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "/../";
      assertEquals( false, urlVal.isValid(test));
   }
   public void test_8_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "bad_url";
      assertEquals( false, urlVal.isValid(test));
   }
   public void test_9_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "http:/google";
      assertEquals( false, urlVal.isValid(test));
   }
   public void test_10_manual(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      String test = "http://website?query=true#fragment";
      assertEquals( false, urlVal.isValid(test));
   }

/****************
** Partition testing
*****************/
   public void test_1(){
        UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
        String test = "";
        test = "http://";
        assertEquals( false, urlVal.isValid(test) );
   }
   public void test_2(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_3(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://asdf";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_4(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "https://google.com:0";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_5(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com:port";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_6(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com/test";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_7(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com/../";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_8(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com:port/test";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_9(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "https://google.com:0/test";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_10(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com?tag=tagged";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_11(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com?./..";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_12(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com:port?tag=tagged";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_13(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "https://google.com:0?tag=tagged";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_14(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com/../?tag=tagged";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_15(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com/test?tag=tagged";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_16(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com:port/test?tag=tagged";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_17(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "https://google.com:0/test?tag=tagged";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_18(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_19(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      assertEquals( false, urlVal.isValid(null) );
   }
   public void test_20(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "com.google.www//:http";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_21(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "?action=view.google.https://:0";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_22(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "google.com";
      assertEquals( true, urlVal.isValid(test) );
   }
   public void test_23(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "asdf.";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_24(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com?<%>";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_25(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http://google.com?action=view##%^[]{}/<>";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_26(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "gibberish";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_27(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "file:";
      assertEquals( false, urlVal.isValid(test) );
   }
   public void test_28(){
      UrlValidator urlVal = new UrlValidator( null, null, UrlValidator.ALLOW_ALL_SCHEMES );
      String test = "";
      test = "http";
      assertEquals( false, urlVal.isValid(test) );
   }
   
/***********************
** Program Based Testing
***********************/
   public void testIsValid()
   {
      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      assertTrue(urlVal.isValid("http://www.google.com"));
      assertTrue(urlVal.isValid("http://www.google.com/"));
      int statusPerLine = 60;
      int printed = 0;
      boolean printIndex = false;
      if (printIndex)  {
         statusPerLine = 6;
      }
      boolean expected = true;
      StringBuilder testBuffer = new StringBuilder();
       //UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      boolean result = true;
      int testCount = 0;
         //can only test 'http://' scheme
         //for( int i=0; i<testUrlScheme.length; i++){
           for( int j=0; j<testUrlAuthority.length; j++){
             for( int k=0; k<testUrlPort.length; k++){
               for( int l=0; l<testPath.length; l++){
                 for( int m=0; m<testUrlQuery.length; m++){
                   try{
                     testBuffer.append( testUrlScheme[0].item);
                     //System.out.println("  Scheme: "+i);
                     testBuffer.append( testUrlAuthority[j].item);
                     //System.out.println("  Authority: "+j);
                     testBuffer.append( testUrlPort[k].item);
                     //System.out.println("  Port: "+k);
                     testBuffer.append( testPath[l].item);
                     //System.out.println("  Path: "+l);
                     testBuffer.append( testUrlQuery[m].item);
                     //System.out.println("  Query: "+m);

                     expected = !testUrlScheme[0].valid & 
                          !testUrlAuthority[j].valid & 
                          !testUrlPort[k].valid & 
                          !testPath[l].valid &
                          !testUrlQuery[m].valid;

                     String url = testBuffer.toString();
                     result = urlVal.isValid(url);
                     //assertEquals(url, expected, result);
                     testCount++;
                     System.out.println("Expected: "+expected);
                     if(result != expected){ //!expected
                       System.out.println("test# "+testCount+"    "+url+"    "+result);
                     }
                        testBuffer.setLength(0);
                     }
                     catch(Exception e){
                     }
                  }
               //}
               }
            }
         }
   }
   
   //Used below code fomr UrlValidatorTest from FinalProjectA to help generate tests
   ResultPair[] testUrlScheme = {new ResultPair("http://", true),
                               new ResultPair("ftp://", true),
                               new ResultPair("h3t://", true),
                               new ResultPair("3ht://", false),
                               new ResultPair("http:/", false),
                               new ResultPair("http:", false),
                               new ResultPair("http/", false),
                               new ResultPair("://", false),
                               new ResultPair("", true)};

   ResultPair[] testUrlAuthority = {new ResultPair("www.google.com", true),
                                  new ResultPair("go.com", true),
                                  new ResultPair("go.au", true),
                                  new ResultPair("0.0.0.0", true),
                                  new ResultPair("255.255.255.255", true),
                                  new ResultPair("256.256.256.256", false),
                                  new ResultPair("255.com", true),
                                  new ResultPair("1.2.3.4.5", false),
                                  new ResultPair("1.2.3.4.", false),
                                  new ResultPair("1.2.3", false),
                                  new ResultPair(".1.2.3.4", false),
                                  new ResultPair("go.a", false),
                                 new ResultPair("go.a1a", false),
                                  new ResultPair("go.1aa", false),
                                  new ResultPair("aaa.", false),
                                  new ResultPair(".aaa", false),
                                  new ResultPair("aaa", false),
                                  new ResultPair("", false)
   };
   ResultPair[] testUrlPort = {new ResultPair(":80", true),
                             new ResultPair(":65535", true),
                             new ResultPair(":0", true),
                             new ResultPair("", true),
                             new ResultPair(":-1", false),
                            new ResultPair(":65636",false),
                             new ResultPair(":65a", false)
   };
   ResultPair[] testPath = {new ResultPair("/test1", true),
                          new ResultPair("/t123", true),
                          new ResultPair("/$23", true),
                          new ResultPair("/..", false),
                          new ResultPair("/../", false),
                          new ResultPair("/test1/", true),
                          new ResultPair("", true),
                          new ResultPair("/test1/file", true),
                          new ResultPair("/..//file", false),
                          new ResultPair("/test1//file", false)
   };
   //Test allow2slash, noFragment
   ResultPair[] testUrlPathOptions = {new ResultPair("/test1", true),
                                    new ResultPair("/t123", true),
                                    new ResultPair("/$23", true),
                                    new ResultPair("/..", false),
                                    new ResultPair("/../", false),
                                    new ResultPair("/test1/", true),
                                    new ResultPair("/#", false),
                                    new ResultPair("", true),
                                    new ResultPair("/test1/file", true),
                                    new ResultPair("/t123/file", true),
                                    new ResultPair("/$23/file", true),
                                    new ResultPair("/../file", false),
                                    new ResultPair("/..//file", false),
                                    new ResultPair("/test1//file", true),
                                    new ResultPair("/#/file", false)
   };

   ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),
                              new ResultPair("?action=edit&mode=up", true),
                              new ResultPair("", true)
   };

   Object[] testUrlParts = {testUrlScheme, testUrlAuthority, testUrlPort, testPath, testUrlQuery};
   Object[] testUrlPartsOptions = {testUrlScheme, testUrlAuthority, testUrlPort, testUrlPathOptions, testUrlQuery};
   int[] testPartsIndex = {0, 0, 0, 0, 0};

   //---------------- Test data for individual url parts ----------------
   ResultPair[] testScheme = {new ResultPair("http", true),
                            new ResultPair("ftp", false),
                            new ResultPair("httpd", false),
                            new ResultPair("telnet", false)};

}
