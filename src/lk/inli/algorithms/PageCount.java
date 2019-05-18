package lk.inli.algorithms;

public class PageCount {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        if (p == 1 || p == n) return 0;

        int noOfPagesToTurnFromFront = (p-1)/2 + (p-1)%2;
        int noOfPagesToTurnFromEnd = 0;
        int noOfPagesAfterP = n - p + 1;

        if (n%2 > 0) { //even no of pages. 2 pages at the end page
            if (p == (n-1)) return 0;
            noOfPagesToTurnFromEnd = (noOfPagesAfterP - 2)/2 + (noOfPagesAfterP - 2)%2;
        } else { //single page at the end page
            noOfPagesToTurnFromEnd = (noOfPagesAfterP - 1)/2 + (noOfPagesAfterP - 1)%2;
        }

        if (noOfPagesToTurnFromFront <= noOfPagesToTurnFromEnd) {
            return noOfPagesToTurnFromFront;
        } else {
            return noOfPagesToTurnFromEnd;
        }
    }

    public static void main(String[] args) {
        System.out.println(PageCount.pageCount(6, 2));
        System.out.println(PageCount.pageCount(5, 4));
        System.out.println(PageCount.pageCount(200, 100));
    }
}
