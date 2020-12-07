////////////////////////////////////////////////////////////////////
// [MASSIMO] [DE ROSA] [1201171]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;

public class TakeAwayBillException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TakeAwayBillException(String msg) {
        super(msg);
    }
}
