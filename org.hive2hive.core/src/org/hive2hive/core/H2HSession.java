package org.hive2hive.core;

import java.security.KeyPair;

import org.hive2hive.core.file.FileManager;
import org.hive2hive.core.network.data.UserProfileManager;
import org.hive2hive.core.process.login.SessionParameters;
import org.hive2hive.core.security.UserCredentials;

public class H2HSession {

	private final UserProfileManager profileManager;
	private final IFileConfiguration fileConfiguration;
	private final KeyPair keyPair;
	private final FileManager fileManager;

	public H2HSession(SessionParameters sessionParameters) {
		this.keyPair = sessionParameters.getKeyPair();
		this.profileManager = sessionParameters.getProfileManager();
		this.fileConfiguration = sessionParameters.getFileConfig();
		this.fileManager = sessionParameters.getFileManager();
	}

	public UserProfileManager getProfileManager() {
		return profileManager;
	}

	public UserCredentials getCredentials() {
		return profileManager.getUserCredentials();
	}

	public IFileConfiguration getFileConfiguration() {
		return fileConfiguration;
	}

	public KeyPair getKeyPair() {
		return keyPair;
	}

	public FileManager getFileManager() {
		return fileManager;
	}
}
