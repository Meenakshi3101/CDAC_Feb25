class StudentPassFail{
public static void main(String[] args){
int sub1 = 20;
int sub2 = 50;
int sub3 = 50;

int failcount = 0;

if(sub1 <= 40)
   failcount++;
if(sub2 <= 40)
   failcount++;
if (sub3 <= 40)
   failcount++;

if(failcount == 0){
    System.out.println("Student passes");
}else{

System.out.println( "students failed are " + failcount + " in subjects");
}
}
}

