public class stuEntity {
    private int studentId;// 学号
    private String name;
    private int age;
    private String sex;// 性别
    private int roomNumber;// 房间号
    private String degree;//学位
    private int grade;//年级
    private String deviceNumber;// 设备号
    private int groupNumber;// 所属的小组
    private int javaScore;// java成绩
    private int netScore;// NET成绩
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /**
     * 初始化有参构造函数
     *
     * @param studentId
     * @param name
     * @param age
     * @param sex
     * @param roomNumber
     * @param deviceNumber
     * @param groupNumber
     * @param javaScore
     * @param netScore
     */
    public stuEntity(String name, int age, String sex, int roomNumber,
                     String deviceNumber, int groupNumber, int javaScore, int netScore) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.roomNumber = roomNumber;
        this.deviceNumber = deviceNumber;
        this.groupNumber = groupNumber;
        this.javaScore = javaScore;
        this.netScore = netScore;
    }
        /**
         * 无参构造函数
         */

        public stuEntity() {
        }
        public int getJavaScore() {
            return javaScore;
        }
        public void setJavaScore(int javaScore) {
            this.javaScore = javaScore;
        }
        public int getNetScore() {
            return netScore;
        }
        public void setNetScore(int netScore) {
            this.netScore = netScore;
        }
        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;}
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
        public int getRoomNumber() {
            return roomNumber;
        }
        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }
        public String getDeviceNumber() {
            return deviceNumber;
        }
        public void setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
        }
        public int getGroupNumber() {
            return groupNumber;
        }
        public void setGroupNumber(int groupNumber) {
            this.groupNumber = groupNumber;
        }
    }



