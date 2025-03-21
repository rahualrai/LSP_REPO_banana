package org.howard.edu.lsp.midterm.question5;

/**
 * The Music class represents a music track that can be played, paused, stopped, and added to a playlist.
 */
public class Music implements Streamable {
    private String title;

    /**
     * Constructs a new Music instance with the specified title.
     *
     * @param title the title of the music track
     */
    public Music(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    /**
     * Adds the music track to the specified playlist.
     *
     * @param playlistName the name of the playlist
     */
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}