package org.howard.edu.lsp.midterm.question5;

/**
 * The Movie class represents a movie that can be played, paused, stopped, and
 * rewound.
 */
public class Movie implements Streamable {
	private String title;

	/**
	 * Constructs a new Movie instance with the specified title.
	 *
	 * @param title the title of the movie
	 */
	public Movie(String title) {
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Playing movie: " + title);
	}

	@Override
	public void pause() {
		System.out.println("Paused movie: " + title);
	}

	@Override
	public void stop() {
		System.out.println("Stopped movie: " + title);
	}

	/**
	 * Rewinds the movie by the specified number of seconds.
	 *
	 * @param seconds the number of seconds to rewind
	 */
	public void rewind(int seconds) {
		System.out.println("Rewinding movie: " + title + " by " + seconds + " seconds");
	}
}