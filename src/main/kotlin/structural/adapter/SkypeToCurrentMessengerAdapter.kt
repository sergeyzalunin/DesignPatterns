package structural.adapter

class SkypeToCurrentMessengerAdapter(private var skypeMessenger: SkypeMessenger) : IMessenger {
    override fun read(): String {
        return skypeMessenger.exoticRead();
    }
}