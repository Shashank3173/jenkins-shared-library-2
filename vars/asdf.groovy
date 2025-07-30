def call() {
    sh '''
        mkdir -p todo
        echo "this is the shared file from github and used in two pipelines and using it in 30th july pipeline too" | tee -a /todo/new.txt 
    '''

    echo "today's jenkins work is to set up the agent"

    echo "todays golang works is to practice all the previous stuffs and work on go routines channels mutex enums and start with the api"
}
