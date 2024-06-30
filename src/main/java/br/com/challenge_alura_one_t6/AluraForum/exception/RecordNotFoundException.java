package br.com.challenge_alura_one_t6.AluraForum.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException( Long id) {
        super("Could not find record " + id);
    }
}
