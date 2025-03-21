package org.howard.edu.lsp.midterm.question5;

/**
 * The Audiobook class represents an audiobook that can be played, paused, stopped, and have its playback speed adjusted.
 */
public class Audiobook implements Streamable {
    private String title;

    /**
     * Constructs a new Audiobook instance with the specified title.
     *
     * @param title the title of the audiobook
     */
    public Audiobook(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }

    /**
     * Sets the playback speed of the audiobook.
     *
     * @param speed the playback speed
     */
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " to " + speed + "x");
    }
}