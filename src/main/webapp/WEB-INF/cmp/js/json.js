/* 数组转json
* @param array 数组
* @param type 类型 json array
*/
function formatArray(array, type) {
    var dataArray = {};
    $.each(array, function () {
        if (dataArray[this.name]) {
            if (!dataArray[this.name].push) {
                dataArray[this.name] = [dataArray[this.name]];
            }
            dataArray[this.name].push(this.value || '');
        } else {
            dataArray[this.name] = this.value || '';
        }
    });
    return ((type == "json") ? JSON.stringify(dataArray) : dataArray);
}