package br.livro.android.cap9.outros;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Executado ao receber uma intent com ação ABRIR_APLICACAO_TESTE:
 * 
 * Ex: sendBroadcast(new Intent("ABRIR_APLICACAO_TESTE"));
 * 
 * @author ricardo
 *
 */
public class ReceiverAbrirAplicacao extends BroadcastReceiver {
	@Override
	public void onReceive(Context c, Intent intent) {
		//É possível iniciar uma activity ou service aqui
		Toast.makeText(c, "ReceiverAbrirAplicacao executado com sucesso.", Toast.LENGTH_SHORT).show();
	}
}
