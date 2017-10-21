package Fabrica;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Mensaje;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.KindMessage;;

public class FabricaObjetos {
	public static Mensaje fabricaMensajes(KindMessage kindMessage) {
        Mensaje mensaje;
        switch (kindMessage) {
        	case pingServerRequest:
            	mensaje = new PingServerRequest();
                return mensaje;
            case pingServerResponse:
            	mensaje = new PingServerResponse();
                return mensaje;
            case setWaitForSignalRequest:
            	mensaje = new SetWaitForSignalRequest();
                return mensaje;
            case setWaitForSignalResponse:
            	mensaje = new SetWaitForSignalResponse();
                return mensaje;
            case bootstrapOperationRequest:
            	mensaje = new BootstrapOperationResponse();
            case boostrapOperationResponse:
            	mensaje = new BootstrapOperationRequest();
        }
        return null;

    }


}
