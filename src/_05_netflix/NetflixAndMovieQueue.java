package _05_netflix;

import java.io.ObjectInputStream.GetField;

public class NetflixAndMovieQueue {

	public static void main(String[] args) {

		//list of movies to queue
		Movie m1 = new Movie("Twighlight", 1);
		Movie m2 = new Movie("Cats", 2);
		Movie m3 = new Movie("Train to Busan", 3);
		Movie m4 = new Movie("Scott Pilgrim vs the World", 4);
		Movie m5 = new Movie("Pulp Fiction", 5);

		//ticket price
		System.out.println(m1.getTicketPrice());

		//new queue
		NetflixQueue nq = new NetflixQueue();

		//queuing movies
		nq.addMovie(m1);
		nq.addMovie(m2);
		nq.addMovie(m3);
		nq.addMovie(m4);
		nq.addMovie(m5);

		//queue info
		System.out.println("-----");
		nq.printMovies();		
		System.out.println("-----");
		System.out.println("The best movie is " + nq.getMovie(1));
		System.out.println("-----");
		System.out.println("The second best movie is " + nq.getMovie(2));

	}

}
