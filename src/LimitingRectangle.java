public class LimitingRectangle {

    int [][] points;

    public LimitingRectangle(int [][] points){
        this.points = points;
    }

    static LimitingRectangle l = new LimitingRectangle(new int[][] {{-1,2},{3,-5}});


    int min(int ind){
        int min = 1000;
        for(int i=0; i<points.length; i++){
            if (points[i][ind] <= min) min = points[i][ind];
        }
        return min;

    }

    int max(int ind){
        int max = -1000;
        for (int i=0; i<points.length; i++){
            if (points[i][ind] >=max) max = points[i][ind];
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(l.getWidth() + " " + l.getHeight());
        System.out.println(l.getBorders());
    }

    public int getWidth( ) {
        return this.max(0) - this.min(0);
    }

    public int getHeight() {
        return this.max(1) - this.min(1);

    }

    public String getBorders(){
        return this.min(1) + "," + this.max(1) + "," + this.min(0) + "," + this.max(0);
    }


}
