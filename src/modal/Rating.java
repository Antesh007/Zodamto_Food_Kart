package modal;

import java.util.ArrayList;

public class Rating {
		private ArrayList<Comment> listOfComments;
		private ArrayList<Integer> listOfRating;
		private int totalRatingSum;
		
		public Rating() {
			this.listOfComments = new ArrayList<>();
			listOfRating = new ArrayList<>();
			totalRatingSum = 0;
		}
		
		public double getAverageRating()
		{
			return totalRatingSum/(listOfRating.size());
		}
		
		public void addRatingAndComment(int ratingScore,String userComment) {
	        Comment comment = new Comment(userComment);
	        listOfComments.add(comment);
	        listOfRating.add(ratingScore);
	        totalRatingSum += ratingScore;
	    }
}
