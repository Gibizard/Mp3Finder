class Song (var title: String, var artist: String, var album: String, var length: String){
    override fun toString(): String {
        return "Title: $title\nArtist: $artist\nAlbum: $album\nLength: $length\n"
    }
}