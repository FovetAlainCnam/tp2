package question2;

public class ProxyVaultAccess extends AbstractVaultAccess {
    private RealVaultAccess realVaultAccess = new RealVaultAccess();
    @Override
    public String accessVault(String key, boolean fingerprint, String password, boolean eyeScanner) {
        if(key.equals("vault_key") && fingerprint && password.equals("vault_password") && eyeScanner) {
            return realVaultAccess.accessVault(key, fingerprint, password, eyeScanner);
        } else {
            return "access_denied";
        }
    }
}
