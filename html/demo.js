function loadScript(src, callback) {
    var script = document.createElement("script");
    script.src = src;
    script.onload = function(){
        console.log("loaded script with src :" +src);
        callback(null, src);
    }

    script.onerror=function(){
        console.log("Error with src : " +src);
        callback(new Error("src got some error!"));
    }
    document.body.appendChild(script);
}
    function demo(error, src){
        if(error){
            console.log(error);
            return;
        }
        alert("demo ");
    }

    function test(error, src){
        if(error){
            console.log(error);
            return;
        }
        alert("test");
    }

loadScript("https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js", test);