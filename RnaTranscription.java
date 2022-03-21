class RnaTranscription {
    String transcribe(String dnaStrand) {
        int i;
        StringBuilder result = new StringBuilder();
        for(i = 0; i < dnaStrand.length(); i++){
            if (dnaStrand.charAt(i) == 'G'){
                result.append('C');
            }
            else if (dnaStrand.charAt(i) == 'C'){
                result.append('G');
            }
            else if (dnaStrand.charAt(i) == 'T'){
                result.append('A');
            }
            else if (dnaStrand.charAt(i) == 'A'){
                result.append('U');
            }
            else{
                throw new IllegalArgumentException("Invalid input");
            }
        }
        return result.toString();
    }
}