import java.util.Arrays;

public class main {

    String[] name;
    int[] age;

    private main(String[] name,int[] age)
    {
        this.name = name;
        this.age = age;

        for (int i = 0; i<name.length;i++)
        {
            System.out.println(name[i]);
            System.out.println(age[i]);

        }

    }

    public static void main(String[] args) {

        String[] newName = {"john","Jax","Peter","Artor","Samael"};
        int[] age ={23,12,34,45,56};

        main user1 = new main(newName,age);

        System.out.println(user1);


    }

}
