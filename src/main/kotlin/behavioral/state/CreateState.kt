package behavioral.state

class CreateState : MessageState {

    constructor(){
        deliveryText = "New message delivering"
        receiveText = "New message receiving"
        deleteText = "New message deleting"
    }
}