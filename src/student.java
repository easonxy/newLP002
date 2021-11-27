public class student {
    private String name;
    private String home;
    private int age;
    public student (String name, String home, int age){
        this.name = name;
        this.home = home;
        this.age = age;
    }
    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(name);
//        sb.append(home);
//        sb.append(age);
//       return sb.toString();
         return (name +"---"+ home+"---"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
