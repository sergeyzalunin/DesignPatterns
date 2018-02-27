package structural.adapter

class CurrentMessenger : IMessenger {
    override fun read(): String {
        return "Current messenger"
    }
}