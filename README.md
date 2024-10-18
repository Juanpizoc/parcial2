# parcial2


## punto 1

CREATE OR REPLACE FUNCTION validar_correo(p_correo VARCHAR2)
RETURN VARCHAR2
IS
    v_longitud INTEGER := LENGTH(p_correo);
    v_mensaje VARCHAR2(100);
BEGIN
    IF v_longitud < 10 OR v_longitud > 30 THEN
        RETURN 'El correo debe tener entre 10 y 30 caracteres';
    END IF;

    IF REGEXP_LIKE(p_correo, '^[a-zA-Z0-9]+@[a-zA-Z0-9]+\.com\.co$') THEN
        v_mensaje := 'Correo válido';
    ELSE
        v_mensaje := 'Correo inválido';
    END IF;

    RETURN v_mensaje;
END;
/  
    
    
## punto 2    


CREATE OR REPLACE FUNCTION es_multiplo_de_tres(p_numero NUMBER)
RETURN VARCHAR2
IS
BEGIN
    IF MOD(p_numero, 3) = 0 THEN
        RETURN 'Es múltiplo de 3';
    ELSE
        RETURN 'No es múltiplo de 3';
    END IF;
END;
/

