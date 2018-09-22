import java.util.*
import java.util.logging.Level
import java.util.logging.Logger

fun main(args: Array<String>) {
    Logger.getLogger("org.jaudiotagger").setLevel(Level.OFF);
    val songList = SongList()
    if (songList.makeList()) {
        val sc = Scanner(System.`in`)
        val banner = "1. List All SONGS\n2. Find a song by a TITLE\n3. Find a song by an ARTIST\n4. Find a song by an ALBUM\n\nType \"q\" to Exit"
        println(banner)
        var k = sc.nextLine()
        do {
            when (k) {
                "1" -> songList.print()
                "2" -> {
                    println("Enter the TITLE: ")
                    val tmp = sc.nextLine()
                    songList.searchTitle(tmp.toLowerCase())
                }
                "3" -> {
                    println("Enter the ARTIST: ")
                    val tmp = sc.nextLine()
                    songList.searchArtist(tmp.toLowerCase())
                }
                "4" -> {
                    println("Enter the ALBUM: ")
                    val tmp = sc.nextLine()
                    songList.searchAlbum(tmp.toLowerCase())
                }
            }
            songList.makeList()
            println(banner)
            k = sc.nextLine()
            if (!k.equals("1") && !k.equals("2") && !k.equals("3") && !k.equals("4") && !k.equals("q")) println("Incorrect Symbol\n")
        } while (!k.equals("q"))
        println("See you soon Comrade")
    } else println("No \"songs\" directory in this directory\n")
}
