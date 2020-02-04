import java.util.Scanner;
import java.util.Random;
class DiceGame
{
      public static void main(String[] args)
      {
             Scanner sc=new Scanner(System.in);
             Random rd=new Random();
             System.out.println("Enter first player name");
             String fname=sc.next();
             System.out.println("Enter Second player name");
             String sname=sc.next();

              int ftotal=0;
              int stotal=0;
              while(true)
               {
                       while(true)
                       {
                               System.out.println(fname+ " press f to flip the dice");
                               char c1=sc.next().charAt(0);
                               if(c1=='f')
                               {
                                        int score = rd.nextInt(6)+1;
                                        System.out.println(fname+ " you scored: "+score);
                                        if(ftotal+score<=100)
                                        ftotal=ftotal+score;
                                        if(ftotal==100)
                                        {
                                                            System.out.println(fname+ " won the game");
                                                            return;
                                        }
                                        else
                                        {
                                                            System.out.println(fname+" Total score is: "+ftotal);
                                         }
                                         break;
                              }
                              else
                              {
                                         System.out.println("your not pressed f");
                              }
                      }
                       while(true)
                       {
                               System.out.println(fname+ " press s to flip the dice");
                               char c2=sc.next().charAt(0);
                               if(c2=='f')
                               {
                                        int score = rd.nextInt(6)+1;
                                        System.out.println(sname+ " you scored: "+score);
                                        if(ftotal+score<=100)
                                        ftotal=ftotal+score;
                                        if(ftotal==100)
                                        {
                                                            System.out.println(sname+ " won the game");
                                                            return;
                                        }
                                        else
                                        {
                                                            System.out.println(sname+" Total score is: "+stotal);
                                         }
                                         break;
                              }
                              else
                              {
                                         System.out.println("your not pressed s");
                              }
                      }
          }
}
}