package behavioral.visitor

abstract class MessageAggregator {
    abstract fun sendMessageTo(messenger: IMessenger);
}