package Fabrica;
import java.awt.TrayIcon.MessageType;

import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Mensaje;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class FabricaObjetos {
	public static Mensaje fabricaMensajes(MessageType messageType) {

        Mensaje mensaje;

        switch (messageType) {
            case PING_SERVER_REQUEST:
            	mensaje = new PingServerRequest(messageType);
                return mensaje;
            case PING_SERVER_RESPONSE:
            	mensaje = new PingServerResponse(messageType);
                return mensaje;
            case SET_WAIT_fOR_SIGNAL_REQUEST:
            	mensaje = new SetWaitForSignalRequest(messageType);
                return mensaje;
            case SET_WAIT_FOR_SIGNAL_RESPONSE:
            	mensaje = new SetWaitForSignalResponse(messageType);
                return mensaje;
            case BootstrapOperationResponse:
            	mensaje = new BootstrapOperationResponse(messageType);
            case BootstrapOperationRequest = new BootstrapOperationRequest(messageType);
            default:
                return null;
        }

    }


}
