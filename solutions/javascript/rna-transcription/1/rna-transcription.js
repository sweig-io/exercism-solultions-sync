//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const toRna = (dna) => {
  let rna = '';
  dna.split('').forEach((nuc) => {
    if (nuc === 'G') {
      rna += 'C';
    } else if (nuc === 'C') {
      rna += 'G';
    } else if (nuc === 'T') {
      rna += 'A';
    } else if (nuc === 'A') {
      rna += 'U';
    }
   })
  return rna;
};
