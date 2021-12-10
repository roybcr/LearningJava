public class Main {
    public static void main(String[] args) {

        int[][] avgA = { { 3, 2, 5, 9 }, { 4, 7, 3, 8 }, { -20, 7, -1, 7 }, { 7, 7, 7, 2 } };
        int[][] avgB = { { 3, 2 }, { 4, 7 } };
        int[][] avgC = { { 3, 2, 5, 90 }, { 4, 7, 3, 80 }, { -20, 7, -50, -79 } };

        System.out.println("For call avg({{3,2,5,9},{4,7,3,8},{-20,7,-1,7},{7,7,7,2}}), avg is " + AvgQuarter.avg(avgA));
        System.out.println("For call avg({{3,2},{4,7}}), avg is " + AvgQuarter.avg(avgB));
        System.out.println("For call avg({{3,2,5,90},{4,7,3,80},{-20,7,-50,-79}}), avg is " + AvgQuarter.avg(avgC));

        int[][] a = { { 3, 2, 5 }, { 4, 7, 3 }, { -20, 7, -1 }, { 7, 7, 7 } };
        int[][] b = { { 3, 2, 5 }, { 4, 7, 3 }, { -20, 7, -50 }, { 7, 7, 7 } };
        int[][] c = { { 3, 2, 5, 90 }, { 4, 7, 3, 80 }, { -20, 7, -50, -79 } };

        System.out.println("For call pair1({{3,2,5},{4,7,3},{-20,7,-1},{7,7,7}}), result is " + OnePair.pair1(a));
        System.out.println("For call pair1({{3,2,5},{4,7,3},{-20,7,-50},{7,7,7}}), result is " + OnePair.pair1(b));
        System.out.println("For call pair1({{3,2,5,90},{4,7,3,80},{-20,7,-50,-79}}), result is " + OnePair.pair1(c));
    }
}
