package sort;
import java.math.BigInteger;
public class BigIntegerTest
{
 public static void main(String[] argv) throws Exception
   {
  BigInteger bigInteger1=new BigInteger("123456789012345689123413241234109999321413253426256");
  BigInteger bigInteger2=new BigInteger("9999999999999999999999999999999999999999999999999");
  
  //add
  bigInteger1=bigInteger1.add(bigInteger2);
  System.out.println(bigInteger1);
  
  //subtract
  bigInteger1=bigInteger1.subtract(bigInteger2);
  System.out.println(bigInteger1);
  
  //multiplay
  bigInteger1=bigInteger1.multiply(bigInteger2);
  System.out.println(bigInteger1);
  
  //divide
  bigInteger1=bigInteger1.divide(bigInteger2);
  System.out.println(bigInteger1);
  
  //negate
  bigInteger1=bigInteger1.negate();
  System.out.println(bigInteger1);
  
  //pow
  bigInteger1=bigInteger1.pow(10);
  System.out.println(bigInteger1);
  //最后一个(pow)输出822526259969629520153101122399497267810820646209100034107289685263315159632308144831374076434409138022661540729292142535548443646527802945487955787074321901682016392981171243389906853091274410210521602192777845202346331669556282743561193277694935461774695127206357303815843367925743175834034307102019549300834630106026193909111800769211331213033566417046739040269952221223183087733472654826824099458751406700255831111833751227821269483039466115059377165177024376865993794139752199224597958945119666176
   }
}