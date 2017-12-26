package AutomationProblemSolving;

import java.util.Arrays;
import java.util.Comparator;

/*
You are given a Log that contains UserId, ProcessId, Start Time, End Time and Resource Consumption during that time, you need to find out the user who has utilized the most resources.

        Example:


        UID    PID    StartTime    EndTime     Consumption

        1        1        200       300             100

        2        2        230       340             80

        1        3        245       315             50

        1        4        305       330             20
        Time 200 signifies: 02:00.


        Output: UID# 1
        UserID 1 because he has consumed the most number of resources between 200 to 315 (Resource Consumption: 150).

  Things to learn
  how to sort java objects
  how to store data for these types of questions
  can we used in companies to build disk mannagments tools

*/

public class problem1 {


    public static class LogRecord {


      public  int UID,PID,StartTime, EndTime,Consumption,Total;

      public LogRecord(int UID,int PID, int StartTime, int EndTime, int Consumption ){

       this.UID = UID;
       this.PID = PID;
       this.StartTime = StartTime;
       this.EndTime = EndTime;
       this.Consumption = Consumption;
       this.Total = 0;
      }

        @Override
        public String toString() {
            String msg = String.format("\nUID = %d\tPID = %d\tStart = %d\tEnd = %d\tConsumption = %d\tTotal = %d\n",
                    this.UID,
                    this.PID,
                    this.StartTime,
                    this.EndTime,
                    this.Consumption,
                    this.Total);
            return msg;
        }
    }

    public static LogRecord[] logRecords = {

            new LogRecord(1,1,200,300,100),
            new LogRecord(2,2,230,340,80),
            new LogRecord(1,3,245,315,50),
            new LogRecord(1,4,305,330,20)

     };

       public static void main(String args[]){

              System.out.println("DATA");
              System.out.println(Arrays.toString(logRecords));
           Arrays.sort(logRecords, new Comparator<LogRecord>() {

               @Override
               public int compare(LogRecord o1, LogRecord o2) {
                   // TODO Auto-generated method stub
                   if(o1.UID < o2.UID) {
                       return -1;  //small
                   }

                   if(o1.UID == o2.UID) {
                       return 0;	//equal
                   }


                   return 1;	//big
               }

           });


           System.out.println("SORTED");
           System.out.println(Arrays.toString(logRecords));
           calculateTotal(logRecords);
           System.out.println(Arrays.toString(logRecords));
           int maxId = getmaxTotal(logRecords);
           LogRecord maxRecord = logRecords[maxId];
           System.out.println("Max Totals");
           String totalMsg = String.format("UID#%d\nBetween: %d - %d\nMax-Consumption: %d\n",
                   maxRecord.UID,
                   maxRecord.StartTime,
                   maxRecord.EndTime,
                   maxRecord.Total);
           System.out.println(totalMsg);
       }


       public static void calculateTotal(LogRecord[] logRecords){

           int lenght = logRecords.length;

           for(int i= 0;i<lenght;i++){

               LogRecord rec = logRecords[i];
               rec.Total = rec.Consumption;

             for(int j =i+1;j<lenght;j++){

              LogRecord subrec = logRecords[j];
              if(subrec.StartTime>rec.EndTime)
                  break;

              if((rec.StartTime<subrec.StartTime)&&(rec.EndTime>subrec.StartTime)){

                  rec.Total = rec.Total+subrec.Consumption;
                  continue;
              }

              break;
             }

           }
       }


       public static int getmaxTotal(LogRecord[] logRecords){

           int maxId = 0;
           int maxval = logRecords[maxId].Total;
           for(int i=0;i<logRecords.length;i++){

            if(logRecords[i].Total>maxval){

               maxId = i;
               maxval = logRecords[i].Total;

            }

           }

            return maxId;
       }




}
