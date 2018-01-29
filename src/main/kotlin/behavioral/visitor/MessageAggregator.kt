package behavioral.visitor

abstract class MessageAggregator {
    abstract fun sendMessageTo(messager: IMessager);
}