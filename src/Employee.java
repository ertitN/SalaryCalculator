public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

     Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double taxValue;
        if(this.salary<=1000){
            return 0;
        }
        else{
            taxValue = (this.salary*3)/100;
            return taxValue;
        }
    }

    double bonus(){
         double bonusValue = 0;
         if(this.workHours>40){
             bonusValue = (this.workHours - 40)*30;
             return bonusValue;
         }
         else{
             return bonusValue;
         }
    }

    double raiseSalary(){
         int currentYear = 2022;
         int workingYear;
         double increaseAmount;

         workingYear = currentYear - hireYear;

         if(workingYear<10){
             increaseAmount = (this.salary*5)/100;
             return increaseAmount;
         }
         else if(workingYear>9 && workingYear<20){
             increaseAmount = (this.salary*10)/100;
             return  increaseAmount;
         }
         else{
              increaseAmount = (this.salary*15)/100;
              return  increaseAmount;
         }

    }

    void print(){
         double salarywithtaxandBonus = this.salary+(bonus()-tax());
         double totalSalary = this.salary + raiseSalary();
        System.out.println("*************************");
        System.out.println("Adı:"+this.name+
                "\nMaaşı: "+this.salary+
                "\nÇalışma saati: "+this.workHours+
                "\nBaşlangıç Yılı: "+this.hireYear+
                "\nVergi: "+tax()+
                "\nBonus: "+bonus()+
                "\nMaaş Artışı: "+raiseSalary()+
                "\nVergi ve Bonuslar ile Birlikte Maaş: "+salarywithtaxandBonus+
                "\nToplam maaş: "+totalSalary);

    }
}
