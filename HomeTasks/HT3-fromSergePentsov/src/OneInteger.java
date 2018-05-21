import com.sun.org.apache.xpath.internal.SourceTree;

public class OneInteger {
    public int yhwa;  // YearHeightWeightAge  00Y YYY YYYH HHHH HHHW WWW WWWW AAA AAAA

    // age =    0000 0000 0000 0000 0000 0000 0AAA AAAA from 0 to 127 years
    // weight = 0000 0000 0000 0000 0WWW WWWW W000 0000 from 0 to 255 kilograms
    // height = 0000 0000 0HHH HHHH H000 0000 0000 0000 from 0 to 255 centimeters
    // year =   00YY YYYY Y000 0000 0000 0000 0000 0000 from 1900 to 2018 years

    void getAge() {
        int age = yhwa & 0b1111111;
        System.out.println("The age of the human is " + age);
    }

    void setAge(int age) {
        int temp = this.yhwa & 0b11111111111111111111111110000000;
        this.yhwa = temp | age;
    }

    void getWeight() {
        int shiftWeight = yhwa >> 7;
        int weight = shiftWeight & 0b00000000000000000000000011111111;
        System.out.println("The weight of the human is " + weight + " kilograms");
    }

    void setWeight(int weight) {
        int temp = this.yhwa & 0b1111111111111111000000001111111;
        weight = weight << 7;
        this.yhwa = temp | weight;
    }

    void getHeight() {
        int shiftHeight = yhwa >> 15;
        int height = shiftHeight & 0b00000000000000000000000011111111;
        System.out.println("The weight of the human is " + height + " centimeters");
    }

    void setHeight(int height) {
        int temp = this.yhwa & 0b1111111100000000111111111111111;
        height = height << 15;
        this.yhwa = temp | height;
    }

    void getYearOfBirth() {
        int shiftYear = yhwa >> 23;
        int yearOfBirth = shiftYear + 1900;
        System.out.println("The human was born in " + yearOfBirth);
    }

    void setYearOfBirth(int year) {
        int temp = this.yhwa & 0b1000000011111111111111111111111;
        year = year - 1900;
        year = year << 23;
        this.yhwa = temp | year;
    }

}
