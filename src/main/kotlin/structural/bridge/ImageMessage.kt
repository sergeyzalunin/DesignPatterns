package structural.bridge

class ImageMessage : Message() {
    override fun send(fromMessenger : String) {
        this.testMessage = String.format("%s from %s", "ImageMessage", fromMessenger)
    }
}