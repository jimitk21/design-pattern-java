***Adapter Pattern Implementation in Java***

This project demonstrates the Adapter Design Pattern using an AudioPlayer as the main interface that supports playing different audio formats. The MediaAdapter bridges the gap between the AudioPlayer and the AdvancedMediaPlayer, allowing it to play MP4 and VLC files in addition to MP3.

**Project Structure**

src/ - Source code directory
    Structural/ - Main package for the Adapter Pattern implementation
        AdapterPattern/ - Package for Adapter Pattern classes
            MediaPlayer.java - Target interface defining the play method
            AudioPlayer.java - Class implementing MediaPlayer for MP3 playback
            MediaAdapter.java - Adapter class for bridging AudioPlayer and AdvancedMediaPlayer
            AdvancedMediaPlayer.java - Adaptee class that handles advanced media formats
            AdapterPatternDemo.java - Application entry point and test implementation of the Adapter Pattern

**Key Classes**

    MediaPlayer (Target Interface):
        Defines the method play(String audioType, String filename) that all media players must implement.

    AudioPlayer (Client):
        Implements the MediaPlayer interface and provides functionality to play MP3 files. It uses MediaAdapter for other formats.

    MediaAdapter (Adapter):
        Implements the MediaPlayer interface and allows AudioPlayer to utilize the AdvancedMediaPlayer for MP4 and VLC formats.

    AdvancedMediaPlayer (Adaptee):
        Contains methods for playing advanced media formats (MP4 and VLC).

    AdapterPatternDemo (Application):
        The main class that demonstrates the usage of the Adapter Pattern by creating an AudioPlayer and playing various audio formats.

**How to Run the Program**

**commands**


1. **Compile the Java files**:

    ```bash

	C:\Users\jimit\Desktop\designpatternjava> javac Structural/AdapterPattern/*.java

2. **Run the main application**:

```bash

    C:\Users\jimit\Desktop\designpatternjava> java Structural.AdapterPattern.AdapterPatternDemo


Make sure you are in the correct directory (C:\Users\jimit\Desktop\designpatternjava) when running these commands.

**Use Cases**

    **Media Playback**:
        This pattern is useful in applications that need to play multiple audio formats without modifying existing code. The AudioPlayer can seamlessly handle MP3, MP4, and VLC formats by utilizing the MediaAdapter.

    **Compatibility Layer**:
        The Adapter Pattern allows new formats to be added easily. For instance, if a new media format is introduced, a new adapter can be created without changing the existing AudioPlayer code.

Logging

All major actions, such as media playback attempts, are logged using Java's logging framework. Make sure to check the output for the playback status of each audio type.