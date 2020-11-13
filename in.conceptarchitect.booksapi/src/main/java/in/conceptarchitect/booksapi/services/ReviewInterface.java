package in.conceptarchitect.booksapi.services;

import java.util.List;

import in.conceptarchitect.booksapi.booksmodel.Review;



public interface ReviewInterface {

	Review save(Review review);

	List<Review> getAllReviews();

	List<Review> findReviewById(String isbn);

	List<Review> getReviewInRange(int min, int max);

	List<Review> getReviewContainsText(String text);

	int getAverageRating(String isbn);

}
