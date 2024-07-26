package OOPS;

public class classobject {
    public static void main(String[] args) {
        // print the trainer name,technolgy
        //print the student n
      training trainer=new training();
      training.trainename="pawan sharma";
      training.trainertechnology=" java";
        System.out.println( " my name is :"+ training.trainename+" my technologyis:"+training.trainertechnology);

    }
}
class training {
    static String trainename;
    static String trainertechnology;
}
class student{
    String studentname;
    String trainertecchnology;
}

