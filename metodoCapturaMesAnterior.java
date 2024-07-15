if(line.contains("RESUMO DE CONTABILIZACAO DE INSS")){

	dataAuxiliar = memFile.getStringFieldRemoveEspCharsUpper(1);
	String mesAuxiliar = cutString(dataAuxiliar, "- ", "/");
	String anoAuxiliar = cutString(dataAuxiliar, "/");

	logger.logInfo("MES DO CUTSTRING -> " + mesAuxiliar);
	logger.logInfo("ANO DO CUTSTRING -> " + anoAuxiliar);

	String dataString = getLastDayOfMonth(("01")+"/"+getMonth((mesAuxiliar))+"/"+ anoAuxiliar);
	logger.logInfo("CUT STRING MALUCO -> " + dataString);

	if (!dataString.equals("")) {
		String dataMovimentoAux	  = getCampoDate(dataString);
		if (dataMovimentoAux.contains("/")) {
			dataMovimento     = getCampoDate(dataString);
			dataLote		  = getCampoDate(dataMovimento, "", "yyyy-MM");
			
			logger.logInfo("DATA MOVIMENTO -> " + dataMovimento);
			
		}
	}
}