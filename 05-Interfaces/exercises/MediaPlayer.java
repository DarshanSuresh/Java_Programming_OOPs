/**
 * Exercise: Create a media player system using interfaces
 * TODO: Implement interfaces and classes for a media player
 */

// TODO: Create Playable interface
interface Playable {
    // TODO: Add methods: play(), pause(), stop()
}

// TODO: Create Recordable interface
interface Recordable {
    // TODO: Add methods: startRecording(), stopRecording()
}

// TODO: Create Downloadable interface
interface Downloadable {
    // TODO: Add methods: download(), getDownloadProgress()
}

// TODO: Create AudioFile class implementing Playable
class AudioFile implements Playable {
    // TODO: Add fields like title, artist, duration
    // TODO: Implement interface methods
}

// TODO: Create VideoFile class implementing Playable, Downloadable
class VideoFile implements Playable, Downloadable {
    // TODO: Add fields like title, resolution, size
    // TODO: Implement interface methods
}

// TODO: Create Podcast class implementing Playable, Recordable, Downloadable
class Podcast implements Playable, Recordable, Downloadable {
    // TODO: Add fields and implement all interface methods
}

public class MediaPlayer {
    public static void main(String[] args) {
        System.out.println("=== Media Player Interface Exercise ===");
        
        // TODO: Create different media objects
        // TODO: Demonstrate interface polymorphism
        // TODO: Test all interface methods
    }
}