//Miriam_almogren_Section[#41994]_ID[#443200568]_Sheet[#5]

  class Student{
    private int ID;
    private String Name;
    private double Stipend;
    String University;
    private double GPA;
    public void SetInfo (int ID, String name, String uni, double gpa){
      this.Name=name;
      this.ID= ID;
      this.University=uni;
      this.GPA=gpa;
      if (GPA>=4)
        this.Stipend=1000;
        else
        this.Stipend=900;
      
    }
    public void PrintInfo(){
      System.out.println(Name);
      System.out.println(ID);
      System.out.println(University);
      System.out.println(GPA);

    }
    public String getUni (){
      return University;
    }
    public void changeGPA (double newGPA){
      this.GPA=newGPA;
      if (GPA>=4)
        this.Stipend=1000;
        else
        this.Stipend=900;
    }
    public boolean checkSameGPA(Student B){
      if (this.GPA==B.GPA)
      return true;
      else
      return false;

    }
  }
   