package com.byju.coding.login.linkedIn.controller;

import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ConnectController;

public class ChangeDefaultFlowController extends ConnectController {
	
	public ChangeDefaultFlowController(ConnectionFactoryLocator connectionFactoryLocator,
			ConnectionRepository connectionRepository) {
		super(connectionFactoryLocator, connectionRepository);
	}
	
	@Override
    protected String connectedView(String providerId) {
        return "redirect:/"+providerId;
    }
}
