package zhang.springframework.gof.strategy.strategies;

public interface EncryptionStrategy {
    void encryptData(String plainText);
}
