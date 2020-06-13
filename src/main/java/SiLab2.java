import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SiLab2 {
    public List<Integer> function(List<Angle> angleList)//1
     {
        List<Integer> result = new ArrayList<>();//2


        for (int i = 0; i < angleList.size(); i++) //3
        {
            int deg = angleList.get(i).getDegrees();//A//5
            int min = angleList.get(i).getMinutes();//A//6
            int sec = angleList.get(i).getSeconds();//A//7

            if (deg >= 0 && deg < 360)//E //8
                {
                if (min < 0 || min > 59)//C//9
                    throw new RuntimeException("The minutes of the angle are not valid!");//J//10
                else//11
                    {
                    if (sec < 0 || sec > 59)//G//12
                        throw new RuntimeException("The seconds of the angle are not valid");//J//13
                    else//14
                        result.add(deg * 3600 + min * 60 + sec);//15
                }
            } else if (deg == 360)//I//16
                 {
                if (min == 0 && sec == 0)//E//17
                    result.add(deg * 3600 + min * 60 + sec);//18
                else//19
                    throw new RuntimeException("The angle is greater then the maximum");//20
            } else//21
                {
                throw new RuntimeException("The angle is smaller or greater then the minimum");//22
            }
        }
        return result;//K//23

    }//24
}

