export function isLeap(year: Number) {
    return year % 4 === 0 && (year % 400 === 0 || year % 100 !== 0);
}
