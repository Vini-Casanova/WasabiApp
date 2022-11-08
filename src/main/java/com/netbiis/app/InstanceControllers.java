package com.netbiis.app;

import com.netbiis.controllers.ClienteController;
import com.netbiis.controllers.PagamentoController;
import com.netbiis.controllers.ProdutoController;
import com.netbiis.service.ClienteServices;
import com.netbiis.service.PagamentoService;
import com.netbiis.service.ProdustosService;

public interface InstanceControllers {
	static final ClienteServices cf = new ClienteController();
	static final PagamentoService pf= new PagamentoController();
	static final ProdustosService prodf= new ProdutoController();

}
