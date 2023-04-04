public class App {
    public static void main(String[] args) throws Exception {
        getVoteCount(10, 2);
    }

    public static int getVoteCount(int upvotes, int downvotes){
        return upvotes - downvotes;
    }
}
